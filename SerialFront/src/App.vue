<script setup lang="ts">
import Image from './components/Image.vue';
import Form from './components/Form.vue';
import Tabla from './components/Tabla.vue';
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
	<section class="centrar">
		<Tabla />
	</section>
</template>

<style scoped>
main {
	display: flex;
	justify-content: space-around;
	flex-direction: row;
	width: 100vh;
	height: 50vh;
}
div {
	width: 700px;
	height: 100%;
}
.centrar {
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>
