FROM node:lts-alpine3.16

WORKDIR /usr/app

COPY package.json ./

COPY package-lock.json ./

COPY ./ ./

#RUN npm ci

RUN apk add --no-cache bash

RUN chmod +x ./env.sh

CMD ["npm", "start"]