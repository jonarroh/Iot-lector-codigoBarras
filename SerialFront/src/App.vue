<script setup lang="ts">
import Image from './components/Image.vue';
import Form from './components/Form.vue';
import Tabla from './components/Tabla.vue';
import { useRegistroStore } from './store/useRegistroStore';
import { ref, watch } from 'vue';

const { addMatricula } = useRegistroStore();

const matricula = ref('');

watch(matricula, async newMatricula => {
	if (newMatricula.length !== 8) {
		return;
	}
	addMatricula(newMatricula);
	matricula.value = '';
});

//obtener la matricula del store de pinia
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
	<section>
		<label for="matricula">Matricula</label>
		<input
			type="text"
			id="matricula"
			placeholder="Ingresar matricula"
			v-model="matricula"
		/>
	</section>
	<section>
		<Tabla />
	</section>
</template>

<style scoped>
main {
	display: flex;
	justify-content: space-around;
	flex-direction: row;
	width: 100vh;
	height: 55vh;
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
section {
	display: flex;
	justify-content: center;
	align-items: center;
	text-align: center;
	margin: 20px !important;
}

label {
	display: block;
	width: 100px;
}

table {
	width: 100%;
}
</style>
