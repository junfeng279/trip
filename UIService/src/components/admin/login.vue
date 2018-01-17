<template>
  <div style="margin: 0 auto; padding-bottom: 0%; padding-top: 7.5%; width: 380px;">
    <div class="panel panel-color panel-danger panel-pages panel-shadow">
      <div class="panel-heading">
        <div class="bg-overlay"></div>
        <h3 class="text-center m-t-10">
          Login My Blog
        </h3>
      </div>
      <div class="panel-body">
        <form class="form-horizontal m-t-20" method="post" id="loginForm">
          <div class="form-group">
            <div class="col-xs-12">
              <input class="input-border input-lg" name="username" type="text" required="" placeholder="账号:"/>
            </div>
          </div>
          <div class="form-group">
            <div class="col-xs-12">
              <input class="input-lg input-border" name="password" required="" placeholder="密码:"/>
            </div>
          </div>
          <div class="form-group">
            <div class="col-xs-12">
              <div class="checkbox checkbox-danger">
                <input id="checkbox-sigup" name="remeber_me" type="checkbox"/>
                <label for="checkbox-sigup">记住我</label>
              </div>
            </div>
          </div>
          <div class="form-group text-center m-t-40">
            <div class="col-xs-12">
              <button class="btn btn-danger btn-lg btn-rounded btn-block w-lg waves-effect waves-light" style="box-shadow: 0px 0px 4px #868282;">登&nbsp;录</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>
<script>
  /* eslint-disable indent */

  export default {
      name: 'Login'
  }
</script>
<style>
  @import "../../static/css/bootstrap.css";
  @import "../../static/css/font-awesome.css";
  @import "../../static/css/style.min.css";
</style>
