import axios from 'axios';

const SERVICE_URL = `${import.meta.env.VITE_API_URL}/comment`

export class CommentService {
    constructor(){
    }

    getAll() {
        return axios.get(`${SERVICE_URL}/`)
    }

    get(id) {
        return axios.get(`${SERVICE_URL}/${id}`)
    }

    create(dto) {
        return axios.post(SERVICE_URL, dto)
    }

    update(dto) {
        return axios.put(SERVICE_URL, dto)
    }

    delete(id) {
        return axios.delete(`${SERVICE_URL}/${id}`)
    }

    getByTopicId(topicId) {
        return axios.get(`${SERVICE_URL}/findByTopicId/${topicId}`)
    }
}