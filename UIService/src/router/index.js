/* eslint-disable indent,comma-dangle */
import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/components/HelloWorld';
import Login from '@/components/admin/login';
import Index from '@/components/admin/index';
import Dashboard from '@/components/admin/dashboard';
import Publish from '@/components/admin/publish';
import Articles from '@/components/admin/articles';
import Pages from '@/components/admin/pages';
import PageEdit from '@/components/admin/pageEdit';
import Comments from '@/components/admin/comments';
import Category from '@/components/admin/category';
import Attach from '@/components/admin/attach';
import Links from '@/components/admin/links';
import System from '@/components/admin/system';

Vue.use(Router);

export default new Router({
  routes: [{
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    }, {
      path: '/login',
      name: 'Login',
      component: Login
    }, {
      path: '/index',
      name: 'Index',
      component: Index,
      children: [
          {
              path: 'dashboard',
              name: 'Dashboard',
              component: Dashboard
          }, {
              path: 'publish',
              name: 'Publish',
              component: Publish
          }, {
              path: 'articles',
              name: 'Articles',
              component: Articles
          }, {
              path: 'pages',
              name: 'Pages',
              component: Pages
          }, {
              path: 'pageEdit',
              name: 'PageEdit',
              component: PageEdit
          }, {
              path: 'comments',
              name: 'Comments',
              component: Comments
          }, {
              path: 'category',
              name: 'Category',
              component: Category
          }, {
              path: 'attach',
              name: 'Attach',
              component: Attach
          }, {
              path: 'links',
              name: 'Links',
              component: Links
          }, {
              path: 'system',
              name: 'System',
              component: System
          }
      ]
    }

  ]
});
