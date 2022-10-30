import { defineStore } from 'pinia';

export const useMatriculaStore = defineStore('matricula', {
	state: () => ({
		matricula: ''
	}),
	actions: {
		addMatricula(matricula: string) {
			this.matricula = matricula;
		}
	}
});
