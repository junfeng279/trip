/**
 *后台登录页面js
 */
( function( window ) {
    'use strict';
    var login = new Vue({
        el: "#login-form",
        data: {
            email: "",
            password: "",
            remember: false
        },
        methods: {
            checked: function(data){
                this.remember = !data;
            },
            submit: function(){
                var that = this;
                if(this.email==""){
                    alert("用户名不能为空!");
                    return ;
                }
                if(this.password==""){
                    alert("密码不能为空!");
                    return ;
                }
                var url = "/auth";
                var params = {
                    "username": that.email,
                    "password": that.password,
                    "remember": that.remember
                };
                $.ajax({
                    url: url,
                    type: "POST",
                    dataType: "json",
                    data: JSON.stringify(params),
                    contentType: 'application/json',
                    success: function(data){
                        setCookie("user_token", data.token);
    //                    alert(getCookie("user_token"));
                    },
                    error: function(data){

                    }
                });


            }
        }
    });
})( window );
