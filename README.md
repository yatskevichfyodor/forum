# Description
#### Simple single-page CRUD application.
#### Backend: Java + Spring Boot
#### Frontend: VueJS (Javascript)
#### Other technologies: Docker, MySQL, Liquibase
![Alt text](/description/main-page.PNG "Main page")
![Alt text](/description/topics-panel-page.PNG "Topics list")
![Alt text](/description/add-topic-page.PNG "Add topic page")
![Alt text](/description/topic-page.PNG "Topic page")

## First launch with IDEA
1. Make sure to enable MySQL service
2. In "Run configurations" select and launch rebuild
3. In "Run configurations" select and launch run

## Docker container launch
1. Install Docker
   #### https://docs.docker.com/desktop/install/windows-install/
   #### Make sure to satisfy system requirements.
2. Open cmd as administrator in "forum" folder and type
```sh
docker compose build
docker compose up
```
