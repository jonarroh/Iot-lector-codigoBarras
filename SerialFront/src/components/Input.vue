<template>
	<label :for="idInput">{{ label }}</label>
	<input :id="idInput" :type="type" :placeholder="placeholder" />
</template>

<script lang="ts" setup>
const props = defineProps<{
	idInput: string;
	label: string;
	type: string;
	placeholder: string;
}>();
</script>

<style scoped>
label {
	display: block;
	width: 100px;
}
</style>
