<template>
  <el-menu
    :default-active="activeIndex"
    class="el-menu-demo"
    mode="horizontal"
    :ellipsis="false"
    @select="handleSelect"
  >
    <el-menu-item index="0" class="logo-item">
      <el-image
        :src="src"
        class="logo-img"
        style="width: 100px; height: 50px"
      />
    </el-menu-item>
    <div class="flex-grow" style="background-color: aliceblue" />
    <el-menu-item index="1" style="background-color: blanchedalmond">
      Processing Center
    </el-menu-item>
    <el-sub-menu index="2" style="background-color: bisque">
      <template #title>Workspace</template>
      <el-menu-item index="2-1">item one</el-menu-item>
      <el-menu-item index="2-2">item two</el-menu-item>
      <el-menu-item index="2-3">item three</el-menu-item>
      <el-sub-menu index="2-4">
        <template #title>item four</template>
        <el-menu-item index="2-4-1">item one</el-menu-item>
        <el-menu-item index="2-4-2">item two</el-menu-item>
        <el-menu-item index="2-4-3">item three</el-menu-item>
      </el-sub-menu>
    </el-sub-menu>
  </el-menu>
</template>

<script lang="ts" setup>
import { ref } from "vue";
import { Picture as IconPicture } from "@element-plus/icons-vue";

const src = "/logo/logo_v_1_2.png";

const activeIndex = ref("1");
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath);
};
</script>

<style>
.flex-grow {
  flex-grow: 1;
}
</style>
