# FROM python:alpine3.7
# COPY . /app
# WORKDIR /app
 # RUN pip install -r requirements.txt
# EXPOSE 5001
# ENTRYPOINT [ "python" ]
# CMD [ "demo.py" ]
FROM ubuntu:latest
RUN mkdir /app
WORKDIR /app
