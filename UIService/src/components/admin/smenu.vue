<template xmlns:v-on="http://www.w3.org/1999/xhtml" xmlns:v-bind="http://www.w3.org/1999/xhtml">
  <div class="left side-menu">
    <div class="sidebar-inner slimscrolleft ">
      <div id="sidebar-menu">
        <ul>
          <li v-on:click="changeMenu('dashboard')" v-bind:class="[selected=='dashboard'? 'active':'']">
             <router-link to="/index/dashboard" class="waves-effect" v-bind:class="[selected=='dashboard'? 'active':'']">
                 <i class="fa fa-dashboard" aria-hidden="true"></i><span> 仪表盘&nbsp;&nbsp;&nbsp;&nbsp;</span>
             </router-link>
          </li>
          <li v-on:click="changeMenu('publish')" v-bind:class="[selected=='publish'? 'active':'']">
              <router-link to="/index/publish" class="waves-effect" v-bind:class="[selected=='publish'? 'active':'']">
                 <i class="fa fa-pencil-square-o" aria-hidden="true"></i><span> 发布文章</span>
              </router-link>
          </li>
          <li v-on:click="changeMenu('articles')" v-bind:class="[selected=='articles'? 'active':'']">
             <router-link to="/index/articles" class="waves-effect" v-bind:class="[selected=='articles'? 'active':'']">
              <i class="fa fa-list" aria-hidden="true"></i><span> 文章管理</span>
            </router-link>
          </li>
          <li v-on:click="changeMenu('pages')" v-bind:class="[selected=='pages'? 'active':'']">
            <router-link to="/index/pages" class="waves-effect" v-bind:class="[selected=='pages'? 'active':'']">
              <i class="fa fa-file-text" aria-hidden="true"></i><span> 页面管理</span>
            </router-link>
          </li>
          <li v-on:click="changeMenu('comments')" v-bind:class="[selected=='comments'? 'active':'']">
            <router-link to="/index/comments" class="waves-effect" v-bind:class="[selected=='comments'? 'active':'']">
              <i class="fa fa-comments" aria-hidden="true"></i><span> 评论管理</span>
            </router-link>
          </li>
          <li v-on:click="changeMenu('category')" v-bind:class="[selected=='category'? 'active':'']">
            <router-link to="/index/category" class="waves-effect" v-bind:class="[selected=='category'? 'active':'']">
              <i class="fa fa-tags" aria-hidden="true"></i><span> 分类/标签</span>
            </router-link>
          </li>
          <li v-on:click="changeMenu('attach')" v-bind:class="[selected=='attach'? 'active':'']">
            <router-link to="/index/attach" class="waves-effect" v-bind:class="[selected=='attach'? 'active':'']">
              <i class="fa fa-cloud-upload" aria-hidden="true"></i><span> 文件管理</span>
            </router-link>
          </li>
          <li v-on:click="changeMenu('links')" v-bind:class="[selected=='links'? 'active':'']">
              <router-link to="/index/links" class="waves-effect" v-bind:class="[selected=='links'? 'active':'']">

              <i class="fa fa-link" aria-hidden="true"></i><span> 友链管理</span>
            </router-link>
          </li>
          <li v-on:click="changeMenu('system')" v-bind:class="[selected=='system'? 'active':'']">
              <router-link to="/index/system" class="waves-effect" v-bind:class="[selected=='system'? 'active':'']">
                 <i class="fa fa-gear" aria-hidden="true"></i><span> 系统设置</span>
              </router-link>
          </li>
        </ul>
      </div>
    </div>
  </div>

</template>
<script>
    export default {
        name: 'Smenu',
        data: function () {
            return {
                selected: ''
            };
        },
        methods: {
            changeMenu: function (menu) {
                this.selected = menu;
            }
        }
    };
</script>
<style>
  @import "../../static/css/bootstrap.min.css";
  @import "../../static/css/font-awesome.css";
  @import "../../static/css/style.min.css";
  @import "../../static/css/sweetalert2.css";
</style>
