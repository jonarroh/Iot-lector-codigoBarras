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
			<tr v-for="r in registro" :key="r.id">
				<td>{{ r.id }}</td>
				<td>{{ r.Fecha }}</td>
				<td>{{ r.Hora }}</td>
				<td>{{ r.Matricula }}</td>
			</tr>
		</tbody>
	</table>
</template>
<script lang="ts" setup>
import { storeToRefs } from 'pinia';
import { useRegistroStore } from '../store/useRegistroStore';
import { ref } from 'vue';
// llenar la tabla con los datos del store de pinia

const registroStore = useRegistroStore();
const { registro } = storeToRefs(registroStore);
</script>

<style scoped>
table {
	border-collapse: collapse;
	width: 100%;
	align-self: center;
}
</style>
