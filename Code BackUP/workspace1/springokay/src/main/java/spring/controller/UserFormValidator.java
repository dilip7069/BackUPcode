package spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.model.User;

@Component
public class UserFormValidator implements Validator{
	
	@Override
    public boolean supports(Class<?> paramClass) {
        return User.class.equals(paramClass);
    }
 
    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");
         
        /*User emp = (User) obj;
        if(emp.getId() <=0){
            errors.rejectValue("id", "negativeValue", new Object[]{"'id'"}, "id can't be negative");
        }*/
         
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "role.required");
    }

}
