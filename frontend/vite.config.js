import {fileURLToPath, URL} from 'node:url'

import {defineConfig, loadEnv} from 'vite'
import vue from '@vitejs/plugin-vue'

export default defineConfig(({mode}) => {
    console.log(mode)
    console.log(process.cwd())
    const env = loadEnv(mode, process.cwd());
    console.log(env)
    return {
        plugins: [vue()],
        resolve: {
            alias: {
                '@': fileURLToPath(new URL('./src', import.meta.url))
            }
        },
        server: {
            host: env.HOST,
            port: env.PORT
        },
        define: {
            API_URL: env.API_URL
        }
    }
})
