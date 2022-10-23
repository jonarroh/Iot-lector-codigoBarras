<template>
	<img :src="src" :alt="alt" />
</template>

<script lang="ts" setup>
import { ref } from 'vue';
const props = defineProps<{
	src: string;
	alt: string;
}>();

const src = ref(props.src);
const alt = ref(props.alt);
</script>

<style scoped>
img {
	width: 250px;
	height: 250px;
}
</style>
