import { defineStore } from 'pinia';
export interface RegistroState {
	registro: [
		{
			id: number;
			Fecha: string;
			Hora: string;
			Matricula: string;
		}
	];
	matricula: string;
}

export const useRegistroStore = defineStore('registro', {
	state: (): RegistroState => ({
		registro: [{} as any],
		matricula: ''
	}),
	actions: {
		addRegistro(Fecha: string, Hora: string, Matricula: string) {
			this.registro.push({
				id: this.registro.length,
				Fecha,
				Hora,
				Matricula
			});
		},
		addMatricula(matricula: string) {
			this.matricula = matricula;
		}
	}
});
