<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html ng-app="archive">
<head>
<meta charset="utf8" />
<title>Document Archive</title>
<link href="<c:url value="/resources/css/styles.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/angular-1.2.16.js" />"></script>
<script src="<c:url value="/resources/js/app.js" />"></script>
</head>
<body>
	<div id="wrap">
		<div id="header">
			<h1>Document Archive</h1>
		</div>
		<div id="main" ng-controller="ArchiveCtrl">
			<h2>Documents</h2>
			<table class="table">
				<tr>
					<td>Name</td>
					<td>Date</td>
				</tr>
				<tr>
					<td><input type="text" ng-model="name"
						ng-change="search(name,date);" /></td>
					<td><input type="text" ng-model="date"
						ng-change="search(name,date);" /></td>
				</tr>
			</table>
			<table id="table-6">
				<thead>
					<tr>
						<th>File</th>
						<th>Person</th>
						<th>Date</th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="metadata in metadataList">
						<td><a href="/archive/document/{{metadata.uuid}}">{{metadata.fileName}}</a></td>
						<td><a href="/archive/document/{{metadata.uuid}}">{{metadata.personName}}</a></td>
						<td><a href="/archive/document/{{metadata.uuid}}">{{metadata.documentDate
								| date:'yyyy-MM-dd'}}</a></td>
					</tr>
				</tbody>
			</table>
		</div>
		<div id="sidebar" ng-controller="UploadCtrl">
			<h2>Upload</h2>
			<table class="table">
				<tr>
					<td>Name</td>
				</tr>
				<tr>
					<td><input type="text" ng-model="name"></td>
				</tr>
				<tr>
					<td>Date</td>
				</tr>
				<tr>
					<td><input type="text" ng-model="date"></td>
				</tr>
				<tr>
					<td><input type="file" class="custom-file-input"
						file-model="myFile"></td>

				</tr>
				<tr>
					<td><button ng-click="uploadFile()">Upload</button></td>
				</tr>
			</table>
		</div>
		<div id="footer">
			<p>Footer</p>
		</div>
	</div>
</body>
</html>
