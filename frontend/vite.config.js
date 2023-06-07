import {fileURLToPath, URL} from 'node:url'

import {defineConfig, loadEnv} from 'vite'
import vue from '@vitejs/plugin-vue'

export default defineConfig(({mode}) => {
    const env = loadEnv(mode, process.cwd());
    return {
        plugins: [vue()],
        resolve: {
            alias: {
                '@': fileURLToPath(new URL('./src', import.meta.url))
            }
        },
        server: {
            host: env.VITE_HOST,
            port: 8081
        },
        define: {
            API_URL: JSON.stringify(env.VITE_API_URL)
        }
    }
})
