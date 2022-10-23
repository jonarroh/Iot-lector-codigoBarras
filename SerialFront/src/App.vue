<script setup lang="ts">
import Image from './components/Image.vue';
import Form from './components/Form.vue';
</script>

<template>
	<main>
		<div class="centrar">
			<Image alt="persona" src="https://via.placeholder.com/150" />
		</div>
		<div>
			<Form />
		</div>
	</main>
</template>

<style scoped>
main {
	display: flex;
	justify-content: space-around;
	flex-direction: row;
	width: 100vh;
	height: 100vh;
}
div {
	width: 700px;
	height: 50%;
}
.centrar {
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>
