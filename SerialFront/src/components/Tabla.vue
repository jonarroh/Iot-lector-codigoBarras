<template>
	<!-- hacer una tabla que guarde el idRegistro, Fecha, hora, Matricula -->
	<table>
		<thead>
			<tr>
				<th>idRegistro</th>
				<th>Fecha</th>
				<th>Hora</th>
				<th>Matricula</th>
			</tr>
		</thead>
		<tbody>
			<tr v-for="registro in registros" :key="registro.idRegistro">
				<td>{{ registro.idRegistro }}</td>
				<td>{{ registro.fecha }}</td>
				<td>{{ registro.hora }}</td>
				<td>{{ registro.matricula }}</td>
			</tr>
		</tbody>
	</table>
</template>
<script lang="ts" setup>
import { ref } from 'vue';

const registros = ref([
	{
		idRegistro: 0,
		fecha: new Date().toLocaleDateString(),
		hora: new Date().toLocaleTimeString(),
		matricula: ''
	}
]);
</script>

<style scoped>
table {
	border-collapse: collapse;
	width: 600px;
}
</style>
