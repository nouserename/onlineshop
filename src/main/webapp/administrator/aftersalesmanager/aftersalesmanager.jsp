<%@page import="entity.Product"%>
<%@page import="entity.Customer"%>
<%@page import="entity.Order"%>
<%@page import="entity.Admin"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<meta charset="utf-8">
        <title>Dashboard</title>
        <!-- Mobile specific metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <!-- Force IE9 to render in normal mode -->
        <!--[if IE]><meta http-equiv="x-ua-compatible" content="IE=9" /><![endif]-->
        <meta name="author" content="SuggeElson" />
        <meta name="description" content=""
        />
        <meta name="keywords" content=""
        />
        <meta name="application-name" content="sprFlat admin template" />
        <!-- Import google fonts - Heading first/ text second -->
        <link rel="stylesheet" type="text/css">
        <!--[if lt IE 9]>

<![endif]-->
        <!-- Css files -->
        <!-- Table -->
        <link href="/onlineshop/css/table.css" rel="stylesheet">
        <!-- Icons -->
        <link href="/onlineshop/css/assets/css/icons.css" rel="stylesheet" />
        <!-- jQueryUI -->
        <link href="/onlineshop/css/assets/css/sprflat-theme/jquery.ui.all.css" rel="stylesheet" />
        <!-- Bootstrap stylesheets (included template modifications) -->
        <link href="/onlineshop/css/assets/css/bootstrap.css" rel="stylesheet" />
        <!-- Plugins stylesheets (all plugin custom css) -->
        <link href="/onlineshop/css/assets/css/plugins.css" rel="stylesheet" />
        <!-- Main stylesheets (template main css file) -->
        <link href="/onlineshop/css/assets/css/main.css" rel="stylesheet" />
        <!-- Custom stylesheets ( Put your own changes here ) -->
        <link href="/onlineshop/css/assets/css/custom.css" rel="stylesheet" />
        <!-- Fav and touch icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/onlineshop/css/assets/img/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/onlineshop/css/assets/img/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/onlineshop/css/assets/img/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="/onlineshop/css/assets/img/ico/apple-touch-icon-57-precomposed.png">
        <link rel="icon" href="/onlineshop/css/assets/img/ico/favicon.ico" type="image/png">
        <!-- Windows8 touch icon ( http://www.buildmypinnedsite.com/ )-->
        <meta name="msapplication-TileColor" content="#3399cc" />
</head>
<body>
<!-- Start #header -->
        <div id="header">
            <div class="container-fluid">
                <div class="navbar">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="index.html">
                            <i class="im-windows8 text-logo-element animated bounceIn"></i><span class="text-logo">spr</span><span class="text-slogan">flat</span> 
                        </a>
                    </div>
                    <nav class="top-nav" role="navigation">
                        <ul class="nav navbar-nav pull-left">
                            <li id="toggle-sidebar-li">
                                <a href="#" id="toggle-sidebar"><i class="en-arrow-left2"></i>
                        </a>
                            </li>
                            <li>
                                <a href="#" class="full-screen"><i class="fa-fullscreen"></i></a>
                            </li>
                            <li class="dropdown">
                                <a href="#" data-toggle="dropdown"><i class="ec-cog"></i><span class="notification">10</span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#"><i class="en-database"></i> Database <span class="notification">3</span></a>
                                    </li>
                                    <li><a href="#"><i class="st-cube"></i> Packages <span class="notification blue">17</span></a>
                                    </li>
                                    <li><a href="#"><i class="st-health"></i> Disconnects <span class="notification yellow">1</span></a>
                                    </li>
                                    <li><a href="#"><i class="im-images"></i> Images <span class="notification teal">320</span></a>
                                    </li>
                                    <li><a href="#"><i class="st-users"></i> Users <span class="notification orange">2k</span></a>
                                    </li>
                                    <li><a href="#"><i class="st-meter"></i> Traffic <span class="notification magenta">2tb</span></a>
                                    </li>
                                    <li><a href="#"><i class="im-coin"></i> Finances <span class="notification pink">+3k</span></a>
                                    </li>
                                    <li><a href="#"><i class="st-folder"></i> Directories <span class="notification green">17</span></a>
                                    </li>
                                    <li><a href="#"><i class="st-bag"></i> Orders <span class="notification purple">12</span></a>
                                    </li>
                                    <li><a href="#"><i class="ec-contract"></i> Contracts <span class="notification dark">7</span></a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" data-toggle="dropdown"><i class="ec-mail"></i><span class="notification">4</span></a>
                                <ul class="dropdown-menu email" role="menu">
                                    <li class="mail-head">
                                        <div class="clearfix">
                                            <div class="pull-left">
                                                <a href="email-inbox.html"><i class="ec-archive"></i></a>
                                            </div>
                                            <span>Inbox</span> 
                                            <div class="pull-right">
                                                <a href="email-inbox.html"><i class="st-pencil"></i></a>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="search-email">
                                        <form>
                                            <input type="text" name="search" placeholder="Search for emails">
                                            <button type="submit"><i class="ec-search"></i>
                                            </button>
                                        </form>
                                    </li>
                                    <li class="mail-list clearfix">
                                        <a href="#">
                                            <img src="/onlineshop/css/assets/img/avatars/128.jpg" class="mail-avatar pull-left" alt="avatar">
                                            <p class="name">
                                                <span class="status"><i class="en-dot"></i></span> Jason Rivera
                                                <span class="notification">2</span>
                                                <span class="time">12:30 am</span>
                                            </p>
                                            <p class="msg">
                                                I contact you regarding my account please can you set up my pass ...
                                            </p>
                                        </a>
                                    </li>
                                    <li class="mail-list clearfix">
                                        <a href="#">
                                            <img src="/onlineshop/css/assets/img/avatars/129.jpg" class="mail-avatar pull-left" alt="avatar">
                                            <p class="name">
                                                <span class="status off"><i class="en-dot"></i></span> Steeve Mclark
                                                <span class="notification">6</span>
                                                <span class="time">10:26 am</span>
                                            </p>
                                            <p class="msg">
                                                Good job dude awesome work here, please add theese features ...
                                            </p>
                                        </a>
                                    </li>
                                    <li class="mail-list clearfix">
                                        <a href="#">
                                            <img src="/onlineshop/css/assets/img/avatars/130.jpg" class="mail-avatar pull-left" alt="avatar">
                                            <p class="name">
                                                <span class="status off"><i class="en-dot"></i></span> Fellix Jones
                                                <span class="notification">1</span>
                                                <span class="time">7:15 am</span>
                                            </p>
                                            <p class="msg">
                                                I have some issues when try to reach my product page can you ...
                                            </p>
                                        </a>
                                    </li>
                                    <li class="mail-list clearfix">
                                        <a href="#">
                                            <img src="/onlineshop/css/assets/img/avatars/131.jpg" class="mail-avatar pull-left" alt="avatar">
                                            <p class="name">
                                                <span class="status"><i class="en-dot"></i></span> Tina Dowsen
                                                <span class="notification">5</span>
                                                <span class="time">03:46 am</span>
                                            </p>
                                            <p class="msg">
                                                Hello Sugge, i want to apply for your referal program , please ...
                                            </p>
                                        </a>
                                    </li>
                                    <li class="mail-more">
                                        <a href="email-inbox.html">View all <i class="en-arrow-right7"></i></a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="nav navbar-nav pull-right">
                            <li>
                                <a href="#" id="toggle-header-area"><i class="ec-download"></i></a>
                            </li>
                            <li class="dropdown">
                                <a href="#" data-toggle="dropdown"><i class="br-alarm"></i> <span class="notification">5</span></a>
                                <ul class="dropdown-menu notification-menu right" role="menu">
                                    <li class="clearfix">
                                        <i class="ec-chat"></i> 
                                        <a href="#" class="notification-user"> Ric Jones </a> 
                                        <span class="notification-action"> replied to your </span> 
                                        <a href="#" class="notification-link"> comment</a>
                                    </li>
                                    <li class="clearfix">
                                        <i class="st-pencil"></i> 
                                        <a href="#" class="notification-user"> SuggeElson </a> 
                                        <span class="notification-action"> just write a </span> 
                                        <a href="#" class="notification-link"> post</a>
                                    </li>
                                    <li class="clearfix">
                                        <i class="ec-trashcan"></i> 
                                        <a href="#" class="notification-user"> SuperAdmin </a> 
                                        <span class="notification-action"> just remove </span> 
                                        <a href="#" class="notification-link"> 12 files</a>
                                    </li>
                                    <li class="clearfix">
                                        <i class="st-paperclip"></i> 
                                        <a href="#" class="notification-user"> C. Wiilde </a> 
                                        <span class="notification-action"> attach </span> 
                                        <a href="#" class="notification-link"> 3 files</a>
                                    </li>
                                    <li class="clearfix">
                                        <i class="st-support"></i> 
                                        <a href="#" class="notification-user"> John Simpson </a> 
                                        <span class="notification-action"> add support </span> 
                                        <a href="#" class="notification-link"> ticket</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" data-toggle="dropdown">
                                    <img class="user-avatar" src="/onlineshop/css/assets/img/avatars/48.jpg" alt="SuggeElson">SuggeElson</a>
                                <ul class="dropdown-menu right" role="menu">
                                    <li><a href="profile.html"><i class="st-user"></i> Profile</a>
                                    </li>
                                    <li><a href="file.html"><i class="st-cloud"></i> Files</a>
                                    </li>
                                    <li><a href="#"><i class="st-settings"></i> Settings</a>
                                    </li>
                                    <li><a href="login.html"><i class="im-exit"></i> Logout</a>
                                    </li>
                                </ul>
                            </li>
                            <li id="toggle-right-sidebar-li"><a href="#" id="toggle-right-sidebar"><i class="ec-users"></i> <span class="notification">3</span></a>
                            </li>
                        </ul>
                    </nav>
                </div>
                <!-- Start #header-area -->
                <div id="header-area" class="fadeInDown">
                    <div class="header-area-inner">
                        <ul class="list-unstyled list-inline">
                            <li>
                                <div class="shortcut-button">
                                    <a href="#">
                                        <i class="im-pie"></i>
                                        <span>Earning Stats</span>
                                    </a>
                                </div>
                            </li>
                            <li>
                                <div class="shortcut-button">
                                    <a href="#">
                                        <i class="ec-images color-dark"></i>
                                        <span>Gallery</span>
                                    </a>
                                </div>
                            </li>
                            <li>
                                <div class="shortcut-button">
                                    <a href="#">
                                        <i class="en-light-bulb color-orange"></i>
                                        <span>Fresh ideas</span>
                                    </a>
                                </div>
                            </li>
                            <li>
                                <div class="shortcut-button">
                                    <a href="#">
                                        <i class="ec-link color-blue"></i>
                                        <span>Links</span>
                                    </a>
                                </div>
                            </li>
                            <li>
                                <div class="shortcut-button">
                                    <a href="#">
                                        <i class="ec-support color-red"></i>
                                        <span>Support</span>
                                    </a>
                                </div>
                            </li>
                            <li>
                                <div class="shortcut-button">
                                    <a href="#">
                                        <i class="st-lock color-teal"></i>
                                        <span>Lock area</span>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <!-- End #header-area -->
            </div>
            <!-- Start .header-inner -->
        </div>
        <!-- End #header -->
        <!-- Start #sidebar -->
        <div id="sidebar">
            <!-- Start .sidebar-inner -->
            <div class="sidebar-inner">
                <!-- Start #sideNav -->
                <ul id="sideNav" class="nav nav-pills nav-stacked">
                    <li class="top-search">
                        <form>
                            <input type="text" name="search" placeholder="Search ...">
                            <button type="submit"><i class="ec-search s20"></i>
                            </button>
                        </form>
                    </li>
                    <li><a href="index.html">Dashboard <i class="im-screen"></i></a>
                    </li>
                    <li><a href="charts.html">Charts <i class="st-chart"></i></a>
                    </li>
                    <li>
                        <a href="#"> Forms <i class="im-paragraph-justify"></i></a>
                        <ul class="nav sub">
                            <li><a href="forms.html"><i class="ec-pencil2"></i> Form Stuff</a>
                            </li>
                            <li><a href="form-validation.html"><i class="im-checkbox-checked"></i> Form Validation</a>
                            </li>
                            <li><a href="form-wizard.html"><i class="im-wand"></i> Form Wizard</a>
                            </li>
                            <li><a href="wysiwyg.html"><i class="fa-pencil"></i> WYSIWYG editor</a>
                            </li>
                        </ul>
                    </li>
                    <li><a href="#"> Tables <i class="im-table2"></i></a>
                        <ul class="nav sub">
                            <li><a href="tables.html"><i class="en-arrow-right7"></i> Static tables</a>
                            </li>
                            <li><a href="data-tables.html"><i class="en-arrow-right7"></i> Data tables</a>
                            </li>
                        </ul>
                    </li>
                    <li><a href="#"> UI Elements <i class="st-lab"></i></a>
                        <ul class="nav sub">
                            <li><a href="notifications.html"><i class="fa-bell"></i> Notifications</a>
                            </li>
                            <li><a href="panels.html"><i class="br-window"></i> Panels</a>
                            </li>
                            <li><a href="tiles.html"><i class="im-windows8"></i> Tiles</a>
                            </li>
                            <li><a href="elements.html"><i class="st-cube"></i> Elements</a>
                            </li>
                            <li><a href="icons.html"><i class="im-stack"></i> Icons</a>
                            </li>
                            <li><a href="buttons.html"><i class="im-play2"></i> Buttons</a>
                            </li>
                            <li><a href="calendar.html"><i class="im-calendar2"></i> Calendar</a>
                            </li>
                            <li><a href="grid.html"><i class="st-grid"></i> Grid</a>
                            </li>
                            <li><a href="typo.html"><i class="im-font"></i> Typography</a>
                            </li>
                            <li><a href="list.html"><i class="fa-list"></i> Lists</a>
                            </li>
                        </ul>
                    </li>
                    <li><a href="#"><i class="ec-mail"></i> Email app</a>
                        <ul class="nav sub">
                            <li><a href="email-inbox.html"><i class="ec-archive"></i> Inbox</a>
                            </li>
                            <li><a href="email-read.html"><i class="br-eye"></i> Read email</a>
                            </li>
                            <li><a href="email-write.html"><i class="ec-pencil2"></i> Write email</a>
                            </li>
                        </ul>
                    </li>
                    <li><a href="file.html"><i class="en-upload"></i> File Manager</a>
                    </li>
                    <li><a href="gallery.html"><i class="im-images"></i> Gallery</a>
                    </li>
                    <li><a href="widgets.html"><i class="st-diamond"></i> Widgets </a>
                    </li>
                    <li><a href="#"><i class="ec-location"></i> Maps</a>
                        <ul class="nav sub">
                            <li><a href="maps-google.html"><i class="im-map2"></i> Google maps</a>
                            </li>
                            <li><a href="maps-vector.html"><i class="en-location2"></i> Vector maps</a>
                            </li>
                        </ul>
                    </li>
                    <li><a href="#">Pages <i class="st-files"></i></a>
                        <ul class="nav sub">
                            <li><a href="invoice.html"><i class="st-file"></i> Invoice</a>
                            </li>
                            <li><a href="profile.html"><i class="ec-user"></i> Profile page</a>
                            </li>
                            <li><a href="search.html"><i class="ec-search"></i> Search page</a>
                            </li>
                            <li><a href="blank.html"><i class="im-file4"></i> Blank page</a>
                            </li>
                            <li><a href="login.html"><i class="ec-locked"></i> Login page</a>
                            </li>
                            <li><a href="lockscreen.html"><i class="ec-locked"></i> Lock screen</a>
                            </li>
                            <li>
                                <a href="#"><i class="st-files"></i> Error pages</a>
                                <ul class="nav sub">
                                    <li><a href="400.html"><i class="st-file-broken"></i> Error 400</a>
                                    </li>
                                    <li><a href="401.html"><i class="st-file-broken"></i> Error 401</a>
                                    </li>
                                    <li><a href="403.html"><i class="st-file-broken"></i> Error 403</a>
                                    </li>
                                    <li><a href="404.html"><i class="st-file-broken"></i> Error 404</a>
                                    </li>
                                    <li><a href="405.html"><i class="st-file-broken"></i> Error 405</a>
                                    </li>
                                    <li><a href="500.html"><i class="st-file-broken"></i> Error 500</a>
                                    </li>
                                    <li><a href="503.html"><i class="st-file-broken"></i> Error 503</a>
                                    </li>
                                    <li><a href="offline.html"><i class="st-window"></i> Offline</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">Bonus <i class="im-gift"></i></a>
                        <ul class="nav sub">
                            <li><a href="landing.html"><i class="im-airplane"></i> Landing page</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <!-- End #sideNav -->
                <!-- Start .sidebar-panel -->
                <div class="sidebar-panel">
                    <h4 class="sidebar-panel-title"><i class="im-fire"></i> Server usage</h4>
                    <div class="sidebar-panel-content">
                        <ul class="server-stats">
                            <li>
                                <span class="txt">Disk space</span>
                                <span class="percent">78</span>
                                <div id="usage-sparkline" class="sparkline">Loading...</div>
                                <div class="pie-chart" data-percent="78"></div>
                            </li>
                        </ul>
                        <ul class="server-stats">
                            <li>
                                <span class="txt">CPU</span>
                                <span class="percent">56</span>
                                <div id="cpu-sparkline" class="sparkline">Loading...</div>
                                <div class="pie-chart" data-percent="56"></div>
                            </li>
                        </ul>
                        <ul class="server-stats">
                            <li>
                                <span class="txt">Memory</span>
                                <span class="percent">14</span>
                                <div id="ram-sparkline" class="sparkline">Loading...</div>
                                <div class="pie-chart" data-percent="14"></div>
                            </li>
                        </ul>
                    </div>
                </div>
                <!-- End .sidebar-panel -->
            </div>
            <!-- End .sidebar-inner -->
        </div>
        <!-- End #sidebar -->
        <!-- Start #right-sidebar -->
        <div id="right-sidebar" class="hide-sidebar">
            <!-- Start .sidebar-inner -->
            <div class="sidebar-inner">
                <div class="sidebar-panel mt0">
                    <div class="sidebar-panel-content fullwidth pt0">
                        <div class="chat-user-list">
                            <form class="form-horizontal chat-search" role="form">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Search for user...">
                                    <button type="submit"><i class="ec-search s16"></i>
                                    </button>
                                </div>
                                <!-- End .form-group  -->
                            </form>
                            <ul class="chat-ui bsAccordion">
                                <li>
                                    <a href="#">Favorites <span class="notification teal">4</span><i class="en-arrow-down5"></i></a>
                                    <ul class="in">
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/49.jpg" alt="@chadengle">Chad Engle
                                                <span class="has-message"><i class="im-pencil"></i></span>
                                            </a>
                                            <span class="status online"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/54.jpg" alt="@alagoon">Anthony Lagoon</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/52.jpg" alt="@koridhandy">Kory Handy</a>
                                            <span class="status"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/50.jpg" alt="@divya">Divia Manyan</a>
                                            <span class="status"><i class="en-dot"></i></span>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="#">Online <span class="notification green">3</span><i class="en-arrow-down5"></i></a>
                                    <ul class="in">
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/51.jpg" alt="@kolage">Eric Hofman</a>
                                            <span class="status online"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/55.jpg" alt="@mikebeecham">Mike Beecham</a>
                                            <span class="status online"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/53.jpg" alt="@derekebradley">Darek Bradly</a>
                                            <span class="status online"><i class="en-dot"></i></span>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="#">Offline <span class="notification red">5</span><i class="en-arrow-down5"></i></a>
                                    <ul>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="assets/img/avatars/56.jpg" alt="@laurengray">Lauren Grey</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/49.jpg" alt="@chadengle">Chad Engle</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/58.jpg" alt="@frankiefreesbie">Frankie Freesibie</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/57.jpg" alt="@joannefournier">Joane Fornier</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="/onlineshop/css/assets/img/avatars/59.jpg" alt="@aiiaiiaii">Alia Alien</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="chat-box">
                            <h5>Chad Engle</h5>
                            <a id="close-user-chat" href="#" class="btn btn-xs btn-primary"><i class="en-arrow-left4"></i></a>
                            <ul class="chat-ui chat-messages">
                                <li class="chat-user">
                                    <p class="avatar">
                                        <img src="/onlineshop/css/assets/img/avatars/49.jpg" alt="@chadengle">
                                    </p>
                                    <p class="chat-name">Chad Engle <span class="chat-time">15 seconds ago</span>
                                    </p>
                                    <span class="status online"><i class="en-dot"></i></span>
                                    <p class="chat-txt">Hello Sugge check out the last order.</p>
                                </li>
                                <li class="chat-me">
                                    <p class="avatar">
                                        <img src="/onlineshop/css/assets/img/avatars/48.jpg" alt="SuggeElson">
                                    </p>
                                    <p class="chat-name">SuggeElson <span class="chat-time">10 seconds ago</span>
                                    </p>
                                    <span class="status online"><i class="en-dot"></i></span>
                                    <p class="chat-txt">Ok i will check it out.</p>
                                </li>
                                <li class="chat-user">
                                    <p class="avatar">
                                        <img src="/onlineshop/css/assets/img/avatars/49.jpg" alt="@chadengle">
                                    </p>
                                    <p class="chat-name">Chad Engle <span class="chat-time">now</span>
                                    </p>
                                    <span class="status online"><i class="en-dot"></i></span>
                                    <p class="chat-txt">Thank you, have a nice day</p>
                                </li>
                            </ul>
                            <div class="chat-write">
                                <form action="#" class="form-horizontal" role="form">
                                    <div class="form-group">
                                        <textarea name="sendmsg" id="sendMsg" class="form-control elastic" rows="1"></textarea>
                                        <a role="button" class="btn" id="attach_photo_btn">
                                            <i class="fa-picture s20"></i> 
                                        </a>
                                        <input type="file" name="attach_photo" id="attach_photo">
                                    </div>
                                    <!-- End .form-group  -->
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End .sidebar-inner -->
        </div>
        <!-- End #right-sidebar -->
        <!-- Start #content -->
        <div id="content">
            <!-- Start .content-wrapper -->
            <div class="content-wrapper">
                <div class="row">
                    <!-- Start .row -->
                    <!-- Start .page-header -->
                    <div class="col-lg-12 heading">
                        <h1 class="page-header"><i class="im-screen"></i> Dashboard</h1>
                        <!-- Start .bredcrumb -->
                        <ul id="crumb" class="breadcrumb">
                        </ul>
                        <!-- End .breadcrumb -->
                        <!-- Start .option-buttons -->
                        <div class="option-buttons">
                            <div class="btn-toolbar" role="toolbar">
                                <div class="btn-group">
                                    <a id="clear-localstorage" class="btn tip" title="Reset panels position">
                                        <i class="ec-refresh color-red s24"></i>
                                    </a>
                                </div>
                                <div class="btn-group dropdown">
                                    <a class="btn dropdown-toggle" data-toggle="dropdown" id="dropdownMenu1"><i class="br-grid s24"></i></a>
                                    <div class="dropdown-menu pull-right" role="menu" aria-labelledby="dropdownMenu1">
                                        <div class="option-dropdown">
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="im-pie"></i>
                                                    <span>Earning Stats</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="ec-images color-dark"></i>
                                                    <span>Gallery</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="en-light-bulb color-orange"></i>
                                                    <span>Fresh ideas</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="ec-link color-blue"></i>
                                                    <span>Links</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="ec-support color-red"></i>
                                                    <span>Support</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="st-lock color-teal"></i>
                                                    <span>Lock area</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="btn-group dropdown">
                                    <a class="btn dropdown-toggle" data-toggle="dropdown" id="dropdownMenu2"><i class="ec-pencil s24"></i></a> 
                                    <div class="dropdown-menu pull-right" role="menu" aria-labelledby="dropdownMenu2">
                                        <div class="option-dropdown">
                                            <div class="row">
                                                <p class="col-lg-12">Quick post</p>
                                                <form class="form-horizontal" role="form">
                                                    <div class="form-group">
                                                        <div class="col-lg-12">
                                                            <input type="text" class="form-control" placeholder="Enter title">
                                                        </div>
                                                    </div>
                                                    <!-- End .form-group  -->
                                                    <div class="form-group">
                                                        <div class="col-lg-12">
                                                            <textarea class="form-control wysiwyg" placeholder="Enter text"></textarea>
                                                        </div>
                                                    </div>
                                                    <!-- End .form-group  -->
                                                    <div class="form-group">
                                                        <div class="col-lg-12">
                                                            <input type="text" class="form-control tags1" placeholder="Enter tags">
                                                        </div>
                                                    </div>
                                                    <!-- End .form-group  -->
                                                    <div class="form-group">
                                                        <div class="col-lg-12">
                                                            <button class="btn btn-default btn-xs">Save Draft</button>
                                                            <button class="btn btn-success btn-xs pull-right">Publish</button>
                                                        </div>
                                                    </div>
                                                    <!-- End .form-group  -->
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="btn-group">
                                    <a class="btn dropdown-toggle" data-toggle="dropdown" id="dropdownMenu3"><i class="ec-help s24"></i></a>
                                    <div class="dropdown-menu pull-right" role="menu" aria-labelledby="dropdownMenu3">
                                        <div class="option-dropdown">
                                            <p>First time visitor ? <a href="#" id="app-tour" class="btn btn-success ml15">Take app tour</a> 
                                            </p>
                                            <hr>
                                            <p>Or check the <a href="#" class="btn btn-danger ml15">FAQ</a>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End .option-buttons -->
                    </div>
                    <!-- End .page-header -->
                </div>
                <!-- End .row -->
                <div class="outlet">
                    <!-- Start .outlet -->
                    <!-- Page start here ( usual with .row ) -->
                   <table>
						<tr>
						<th>订单编号</th>
						<th>客户手机号</th>
						<th>客户名字</th>
						<th>产品名字</th>
						<th>产品价格</th>
						<th></th>
						<th></th>

						</tr>
						
						<%
							Admin a = (Admin)request.getSession().getAttribute("admin");
						    Order[] orders = a.searchOrder(Order.NR_waitForReview);
						    Customer customer;
							Product product;
							int len = orders.length;
							for(int i = 0;i<len;i++)
							{
								customer = new Customer(orders[i].getCustomer());
								product = new Product(orders[i].getProduct());
								out.println("<tr> <td>"+orders[i].getId()+"</td> <td>"+customer.getId()+"</td> <td>"+customer.getName()+"</td> <td>"+product.getName()+"</td> <td>"+product.getPrice()+"</td> <td> <form method='get' action='/onlineshop/administrator/aftersalesmanager/AfterSalesManager'><input hidden type='text' value='yes' name='kind'><input hidden type='text' name='orderId' value='"+orders[i].getId()+"'><input type='submit' value='同意'></form></td><td><form method='get' action='/onlineshop/administrator/aftersalesmanager/AfterSalesManager'><input hidden type='text' value='no' name='kind'><input hidden type='text' name='orderId' value='"+orders[i].getId()+"'><input type='submit' value='不同意'></td></tr>");
							}
						    
						%>
					</table>
                   
                   
                </div>
                
            
                
                <!-- End .outlet -->
            </div>
            <!-- End .content-wrapper -->
            <div class="clearfix"></div>
        </div>
        <!-- End #content -->
        <!-- Javascripts -->
        <!-- Load pace first -->
        <script src="/onlineshop/css/assets/plugins/core/pace/pace.min.js"></script>
        <!-- Important javascript libs(put in all pages) -->
        <script src="/onlineshop/css/assets/js/jquery-1.8.3.min.js"></script>
        <script>
        window.jQuery || document.write('<script src="/onlineshop/css/assets/js/libs/jquery-2.1.1.min.js">\x3C/script>')
        </script>
        <script src="/onlineshop/css/assets/js/jquery-ui.js"></script>
        <script>
        window.jQuery || document.write('<script src="/onlineshop/css/assets/js/libs/jquery-ui-1.10.4.min.js">\x3C/script>')
        </script>
        <!--[if lt IE 9]>
  <script type="text/javascript" src="/onlineshop/css/assets/js/libs/excanvas.min.js"></script>
  <script type="text/javascript" src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <script type="text/javascript" src="/onlineshop/css/assets/js/libs/respond.min.js"></script>
<![endif]-->
        <!-- Bootstrap plugins -->
        <script src="/onlineshop/css/assets/js/bootstrap/bootstrap.js"></script>
        <!-- Core plugins ( not remove ever) -->
        <!-- Handle responsive view functions -->
        <script src="/onlineshop/css/assets/js/jRespond.min.js"></script>
        <!-- Custom scroll for sidebars,tables and etc. -->
        <script src="/onlineshop/css/assets/plugins/core/slimscroll/jquery.slimscroll.min.js"></script>
        <script src="/onlineshop/css/assets/plugins/core/slimscroll/jquery.slimscroll.horizontal.min.js"></script>
        <!-- Resize text area in most pages -->
        <script src="/onlineshop/css/assets/plugins/forms/autosize/jquery.autosize.js"></script>
        <!-- Proivde quick search for many widgets -->
        <script src="/onlineshop/css/assets/plugins/core/quicksearch/jquery.quicksearch.js"></script>
        <!-- Bootbox confirm dialog for reset postion on panels -->
        <script src="/onlineshop/css/assets/plugins/ui/bootbox/bootbox.js"></script>
        <!-- Other plugins ( load only nessesary plugins for every page) -->
        <script src="/onlineshop/css/assets/plugins/charts/flot/jquery.flot.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/flot/jquery.flot.pie.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/flot/jquery.flot.resize.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/flot/jquery.flot.time.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/flot/jquery.flot.growraf.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/flot/jquery.flot.categories.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/flot/jquery.flot.stack.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/flot/jquery.flot.tooltip.min.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/flot/date.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/sparklines/jquery.sparkline.js"></script>
        <script src="/onlineshop/css/assets/plugins/charts/pie-chart/jquery.easy-pie-chart.js"></script>
        <script src="/onlineshop/css/assets/plugins/forms/icheck/jquery.icheck.js"></script>
        <script src="/onlineshop/css/assets/plugins/forms/tags/jquery.tagsinput.min.js"></script>
        <script src="/onlineshop/css/assets/plugins/forms/tinymce/tinymce.min.js"></script>
        <script src="/onlineshop/css/assets/plugins/misc/highlight/highlight.pack.js"></script>
        <script src="/onlineshop/css/assets/plugins/misc/countTo/jquery.countTo.js"></script>
        <script src="/onlineshop/css/assets/plugins/ui/weather/skyicons.js"></script>
        <script src="/onlineshop/css/assets/plugins/ui/notify/jquery.gritter.js"></script>
        <script src="/onlineshop/css/assets/plugins/ui/calendar/fullcalendar.js"></script>
        <script src="/onlineshop/css/assets/js/jquery.sprFlat.js"></script>
        <script src="/onlineshop/css/assets/js/app.js"></script>
        <script src="/onlineshop/css/assets/js/pages/dashboard.js"></script>


</body>
</html>

