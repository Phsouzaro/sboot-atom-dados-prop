FROM postgres:latest

# Set environment variables (optional)
# You can customize these as needed
ENV POSTGRES_USER=psdev
ENV POSTGRES_PASSWORD=123456
ENV POSTGRES_DB=dados-prop

# Expose the default PostgreSQL port
EXPOSE 5432

# Optionally, you can add a command to run when the container starts
# This is not necessary if you're just using the default PostgreSQL image
# CMD ["postgres"]


#run this commando to build image
#docker build -t postgres-dados-prop .

#run this command to create container
#docker run -d --name postgres-dados-prop -p 5432:5432 postgres-dados-prop