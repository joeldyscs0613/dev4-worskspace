<!DOCTYPE html>
<html lang="en" ng-app="app">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <link rel="icon" href="favicon.ico" />

    <title>Das Boot - Shipwrecks</title>

    <!-- Bootstrap core CSS -->
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <!-- Bootstrap theme -->
    <link href="lib/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
    <!-- Angular CSP-->
    <link href="lib/angular/css/angular-csp.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="lib/html5shiv/html5shiv.min.js"></script>
      <script src="lib/respond/respond.min.js"></script>
    <![endif]-->

    <!-- require -->
    <script src="lib/require/require.js"></script>

    <!-- angularjs -->
    <link href="lib/angular/css/angular-csp.css" rel="stylesheet" />
    <script src="lib/angular/js/angular.js"></script>
    <script src="lib/angular/js/angular-animate.js"></script>
    <script src="lib/angular/js/angular-resource.js"></script>
    <script src="lib/angular/js/angular-ui-router.js"></script>
    <script src="lib/angular/js/angular-ui-bootstrap-tpls.js"></script>

    <!-- your app's js -->
    <script src="js/app.js"></script>
    <script src="js/nav-controller.js"></script>
    <script src="js/controllers.js"></script>
    <script src="js/services.js"></script>
  </head>

  <body>
    <nav class="navbar navbar-inverse navbar-fixed-top" ng-controller="nav">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#/" ng-bind="title"></a>
        </div>
        <script type="text/ng-template" id="nav-item.html">
          <span ng-if="page.name && !page.url">{{page.name}}</span>
          <a ng-if="page.name && page.url && !(page.subPages && page.subPages.length)" href="{{page.url}}">{{page.name}}</a>
          <a ng-if="page.name && page.url && page.subPages && page.subPages.length" href="{{page.url}}" data-toggle="dropdown" role="button" aria-expanded="false"
          class="dropdown-toggle">{{page.name}} <span class="caret"></span>
          </a>
          <ul ng-if="page.subPages && page.subPages.length" class="dropdown-menu" role="menu">
            <li ng-class="{'divider': !page.name && !page.url, 'dropdown-header': page.name && !page.url, active: isUrl(page.url)}" ng-repeat="page in page.subPages" ng-include="'nav-item.html'">
            </li>
          </ul>
        </script>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li ng-repeat="page in pages" ng-class="{active: isUrl(page.url)}" ng-include="'nav-item.html'">
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="ui-view-container">
      <div ui-view>
        <!-- default content can go here but there will be a flicker on some pages loading -->
      </div>
    </div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="lib/jquery/jquery.min.js"></script>
    <script src="lib/bootstrap/js/bootstrap.min.js"></script>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="lib/assets/js/ie10-viewport-bug-workaround.js"></script>

  </body>
</html>