<template>
  <div>
      <Header></Header>
      <Smenu></Smenu>
      <router-view></router-view>
  </div>
</template>
<script>
  /* eslint-disable indent */
  import Header from '@/components/admin/header';
  import Smenu from '@/components/admin/smenu';

  export default{
    name: 'Index',
    components: {
      Header: Header,
      Smenu: Smenu
    }
  };
</script>
<style>
  @import "../../static/css/bootstrap.css";
  @import "../../static/css/font-awesome.css";
  @import "../../static/css/style.min.css";
</style>
