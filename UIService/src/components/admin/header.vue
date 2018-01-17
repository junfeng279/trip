<template>
  <div class="topbar">
    <div class="topbar-left">
      <div class="text-center p-t-10" style="margin: 0 auto;">
        <div class="pull-left" style="padding-left: 10px;">
          <a href="#">
            <img src="../../static/images/logo.png" width="50" height="50"/>
          </a>
        </div>
        <div class="pull-left" style="padding-left: 10px;">
          <span style="font-size: 28px; color: #2f353f; line-height: 50px;">Wan Trip</span>
        </div>
      </div>
    </div>
    <div class="navbar navbar-default" role="navigation">
      <div class="container">
        <div class="">
          <div class="pull-left">
            <button type="button" class="button-menu-mobile open-left">
              <i class="fa fa-bars"></i>
            </button>
            <div class="clearfix"></div>
          </div>
          <ul class="nav navbar-nav navbar-right pull-right">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle profile" data-toggle="dropdown" aria-expanded="true">
                <img src="../../static/images/logo.png" alt="user-img" class="img-circle">
              </a>
              <ul class="dropdown-menu">
                <li>
                  <a href="#" aria-hidden="true"><i class="fa fa-eye"></i> 查看网站</a>
                </li>
                <li>
                  <a href="#"><i class="fa fa-sun-o"></i> 个人设置</a>
                </li>
                <li>
                  <a href="#"><i class="fa fa-sign-out"></i> 注销</a>
                </li>
              </ul>

            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
  /* eslint-disable indent,no-unused-vars */
  import $ from 'jquery';
  import bootstrap from '../../static/js/bootstrap';

  export default{
    name: 'Header'
  };
</script>
<style>
  @import "../../static/css/bootstrap.css";
  @import "../../static/css/font-awesome.css";
  @import "../../static/css/style.min.css";
</style>
