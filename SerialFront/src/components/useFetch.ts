// composable para hacer fetch a una API

import { reactive, watchEffect } from 'vue';

export default function useFetch(url: string) {
	const [data, setData]: any = reactive({
		value: null,
		loading: true,
		error: null
	});
	watchEffect(async () => {
		try {
			const response = await fetch(url);
			if (!response.ok) {
				throw new Error(response.statusText);
			}
			data.value = await response.json();
		} catch (error) {
			data.error = error;
		} finally {
			data.loading = false;
		}
	});
	return data;
}
