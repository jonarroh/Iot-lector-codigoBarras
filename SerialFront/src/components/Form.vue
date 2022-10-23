<template>
	<form v-on:submit.prevent="">
		<Input
			idInput="matricula"
			label="Matricula"
			type="text"
			placeholder="Matricula"
		/>
		<Input
			idInput="nombre"
			label="Nombre"
			type="text"
			placeholder="Nombre"
		/>

		<Input
			idInput="carrera"
			label="Carrera"
			type="text"
			placeholder="Carrera"
		/>

		<Input
			idInput="grupo"
			label="Grupo"
			type="text"
			placeholder="Grupo"
		/>
	</form>
</template>

<script lang="ts" setup>
import Input from './Input.vue';
</script>
