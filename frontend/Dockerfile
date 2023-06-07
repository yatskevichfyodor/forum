FROM node
WORKDIR /app
COPY . /app

RUN npm install
RUN npm install axios
RUN npm install vue-router@4
RUN npm install bootstrap

ENTRYPOINT [ "npm", "run", "dev" ]
