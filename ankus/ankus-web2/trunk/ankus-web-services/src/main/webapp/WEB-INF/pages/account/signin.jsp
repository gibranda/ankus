<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bootstrap Admin</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- For sample logo only-->
    <!--Remove if you no longer need this font-->
    <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Aguafina+Script">
    <!--For sample logo only-->

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/lib/font-awesome/css/font-awesome.css">

    <script src="${pageContext.request.contextPath}/resources/lib/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/awesome/build/javascripts/site.js"
            type="text/javascript"></script>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/lib/awesome/build/stylesheets/theme.css">


    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
</head>

<!--[if lt IE 7 ]>
<body class="ie ie6"> <![endif]-->
<!--[if IE 7 ]>
<body class="ie ie7 "> <![endif]-->
<!--[if IE 8 ]>
<body class="ie ie8 "> <![endif]-->
<!--[if IE 9 ]>
<body class="ie ie9 "> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<body class="">
<!--<![endif]-->


<div class="row-fluid login">
    <div class="dialog">
        <p class="brand" href="${pageContext.request.contextPath}/index">Flamingo</p>

        <div class="block">
            <div class="block-header">
                <h2>Sign In</h2>
            </div>
            <form>
                <label>Username</label>
                <input type="text" class="span12">
                <a class="reset-password" href="${pageContext.request.contextPath}/account/reset">Forgot your
                    password?</a>
                <label>Password</label>
                <input type="password" class="span12">

                <div class="form-actions">
                    <a href="${pageContext.request.contextPath}/j_spring_security_check"
                       class="btn btn-success pull-right">Sign In</a>
                    <label class="remember-me"><input type="checkbox"> Remember me</label>
                    <a href="${pageContext.request.contextPath}/account/signup" class="sign-up">Sign Up</a>

                    <div class="clearfix"></div>
                </div>
            </form>
        </div>
    </div>
</div>


<script src="${pageContext.request.contextPath}/resources/lib/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
    $("[rel=tooltip]").tooltip();
    $(function () {
        $('.demo-cancel-click').click(function () {
            return false;
        });
    });
</script>

</body>
</html>
