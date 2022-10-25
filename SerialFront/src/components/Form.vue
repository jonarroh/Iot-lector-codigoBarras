<template>
	<form>
		<label for="matricula">Matricula</label>
		<input type="text" id="matricula" v-model="matricula" />
		<label for="nombre">Nombre</label>
		<input type="text" id="nombre" v-model="nombre" readonly />
		<label for="Carrera">Carrera</label>
		<input type="text" id="carrera" v-model="carrera" readonly />
		<label for="Grupo">Grupo</label>
		<input type="text" id="grupo" v-model="grupo" readonly />
	</form>
</template>

<script lang="ts" setup>
import { ref, watch } from 'vue';
import Input from './Input.vue';
const matricula = ref('');
const nombre = ref('');
const carrera = ref('');
const grupo = ref('');
const deboundTimeout = ref(5000);
// crear un watch para la matricula
watch(matricula, async newMatricula => {
	console.log(deboundTimeout.value);

	// // hacer un debound para que no se haga la peticion cada vez que se teclea
	// if (deboundTimeout.value) {
	// 	clearTimeout(deboundTimeout.value);

	// 	deboundTimeout.value = setTimeout(async () => {
	// 		if (newMatricula.length !== 8) {
	// 			return;
	// 		}
	// 		const data = await fetch(
	// 			`https://daybook-460dd-default-rtdb.firebaseio.com/alumnos/${newMatricula}.json`
	// 		);
	// 		const alumno = await data.json();
	// 		nombre.value = `${alumno.nombre} ${alumno.primerApellido} ${alumno.segundoApellido}`;
	// 		carrera.value = alumno.carrera;
	// 		grupo.value = alumno.grupo;
	// 		const mensaje = `${matricula.value} ${nombre.value} ${alumno.primerApellido} ${alumno.segundoApellido} ${carrera.value} ${grupo.value}`;

	// 		const data2 = await fetch(
	// 			`http://localhost:8080/SerialRest/api/serial/mensaje`,
	// 			{
	// 				method: 'POST',
	// 				headers: {
	// 					'Content-Type': 'application/x-www-form-urlencoded'
	// 				},
	// 				body: new URLSearchParams({
	// 					mensaje
	// 				})
	// 			}
	// 		);
	// 		const respuesta = await data2.json();
	// 		console.log(respuesta);
	// 	}, 500);
	// }
});
</script>

<style scoped>
label {
	display: block;
	width: 100px;
}
</style>
