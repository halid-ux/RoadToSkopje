FROM node:15.13-alpine as build

WORKDIR /core

ENV PATH="./node_modules/.bin:$PATH"

COPY package*.json .

RUN npm install

COPY . .

RUN npm run build

FROM nginx:1.19

COPY ./nginx/nginx.conf /etc/nginx/nginx.conf
COPY --from=build /core/build /usr/share/nginx/html