<script setup lang="ts">
import BeeHeader from "../components/layout/BeeHeader.vue";
import BeeMain from "../components/layout/BeeMain.vue";
import BeeFooter from "../components/layout/BeeFooter.vue";
</script>

<template>
  <div class="common-layout">
    <el-container>
      <el-header>
        <BeeHeader />
      </el-header>
      <el-main>
        <BeeMain />
      </el-main>
      <el-footer>
        <BeeFooter />
      </el-footer>
    </el-container>
  </div>
</template>
