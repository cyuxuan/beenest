<script setup lang="ts">
import { UserFilled } from '@element-plus/icons-vue'
</script>

<template>
  <div>
    <el-avatar :icon="UserFilled" />
  </div>
</template>

<style scoped>
.demo-type {
  display: flex;
}
.demo-type > div {
  flex: 1;
  text-align: center;
}
.demo-type > div:not(:last-child) {
  border-right: 1px solid var(--el-border-color);
}
</style>
