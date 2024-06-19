# syntax=docker/dockerfile:1

FROM groovy

COPY ./src .


CMD ["groovy", "Main.groovy"]