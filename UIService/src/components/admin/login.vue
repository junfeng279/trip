<template xmlns:v-on="http://www.w3.org/1999/xhtml">
  <div style="margin: 0 auto; padding-bottom: 0%; padding-top: 7.5%; width: 380px;">
    <div class="panel panel-color panel-danger panel-pages panel-shadow">
      <div class="panel-heading">
        <div class="bg-overlay"></div>
        <h3 class="text-center m-t-10">
          Login My Blog
        </h3>
      </div>
      <div class="panel-body">
        <div class="form-horizontal m-t-20" id="loginForm">
          <div class="form-group">
            <div class="col-xs-12">
              <input class="input-border input-lg" name="username" v-model="username" type="text" required="" placeholder="账号:"/>
            </div>
          </div>
          <div class="form-group">
            <div class="col-xs-12">
              <input class="input-lg input-border" name="password" v-model="password" required="" placeholder="密码:"/>
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
              <button class="btn btn-danger btn-lg btn-rounded btn-block w-lg waves-effect waves-light" v-on:click="submits" style="box-shadow: 0px 0px 4px #868282;">登&nbsp;录</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
    /* eslint-disable indent,dot-notation */
  import {setCookie} from '../../static/js/cookieUtil';
  export default {
      name: 'Login',
      data: function () {
          return {
              username: '',
              password: '',
              remember: false
          };
      },
      methods: {
          submits: function () {
              if (this.username === '') {
                  alert('用户名不能为空');
                  return;
              }
              if (this.password === '') {
                  alert('密码不能为空');
              }
              var url = '/api/auth';
              var params = {
                  username: this.username,
                  password: this.password
              };
              var _this = this;
              debugger;
              this.$ajax({
                  method: 'post',
                  url: url,
                  data: JSON.stringify(params),
                  headers: {
                      'Content-Type': 'application/json;charset=UTF-8'
                  },
                  responseType: 'json'
              }).then(function (response) {
                  console.log(response);
                  debugger;
                  if (response.data.token !== '') {
                      console.log(response.data.token);
                      setCookie('token', response.data.token);
                      _this.$router.push('/index');
                  }
              }).catch(function (error) {
                  console.log(error);
                  console.log(this);
              });
          }
      }
  };
</script>
<style>
  @import "../../static/css/bootstrap.css";
  @import "../../static/css/font-awesome.css";
  @import "../../static/css/style.min.css";
</style>
