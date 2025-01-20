<template>
  <div class="main-content">
    <el-carousel height="100vh">
      <el-carousel-item v-for="item in carouselData">
        <img :src="item" alt="" style="width: 100%; height: 100%">
      </el-carousel-item>
    </el-carousel>
  </div>
</template>
<script>
import {defineComponent} from 'vue'

export default {

  data() {
    return {
      carouselData: [
        require('@/assets/imgs/takagisang/1.png'),
        require('@/assets/imgs/takagisang/2.png'),
        require('@/assets/imgs/takagisang/3.png'),
        require('@/assets/imgs/takagisang/4.png'),
        require('@/assets/imgs/takagisang/5.png'),
        require('@/assets/imgs/takagisang/6.png'),
        require('@/assets/imgs/takagisang/7.png'),
        require('@/assets/imgs/takagisang/8.png'),
        require('@/assets/imgs/takagisang/9.png'),
        require('@/assets/imgs/takagisang/10.png'),
        require('@/assets/imgs/takagisang/11.png'),
        require('@/assets/imgs/takagisang/12.png'),
      ]
    }
  },
  mounted() {

  },
  // methods：本页面所有的点击事件或者其他函数定义区
  methods: {

  }
}
</script>