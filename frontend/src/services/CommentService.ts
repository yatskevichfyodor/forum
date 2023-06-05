import axios from 'axios';

const API_URI = 'http://localhost:8080';
const SERVICE_URI: string = API_URI + '/comment';

export class CommentService {
    constructor(){
    }

    getAll() {
        return axios.get(`${SERVICE_URI}/`)
    }

    get(id: number) {
        return axios.get(`${SERVICE_URI}/${id}`)
    }

    create(dto: any) {
        return axios.post(SERVICE_URI, dto)
    }

    update(dto: any) {
        return axios.put(SERVICE_URI, dto)
    }

    delete(id: number) {
        return axios.delete(`${SERVICE_URI}/${id}`)
    }

    getByTopicId(topicId: number) {
        return axios.get(`${SERVICE_URI}/findByTopicId/${topicId}`)
    }
}