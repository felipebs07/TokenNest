CONTAINER_NAME="postgres_i5433"
POSTGRES_PASSWORD="root"
POSTGRES_USER="root"
POSTGRES_DB="security"

# Parar e remover contêiner existente, se houver
if docker ps -a --format '{{.Names}}' | grep -Eq "^${CONTAINER_NAME}$"; then
    echo "Parando e removendo contêiner existente..."
    docker stop $CONTAINER_NAME && docker rm $CONTAINER_NAME
    if [ $? -ne 0 ]; then
        echo "Erro ao parar ou remover o contêiner existente."
        exit 1
    fi
fi

# Criar e iniciar um novo contêiner com o script SQL
docker run --name $CONTAINER_NAME \
    -e POSTGRES_PASSWORD=$POSTGRES_PASSWORD \
    -e POSTGRES_DB=$POSTGRES_DB \
    -e POSTGRES_USER=$POSTGRES_USER \
    -p 5433:5432 \
    -d postgres

if [ $? -ne 0 ]; then
    echo "Erro ao criar o contêiner PostgreSQL."
    exit 1
fi

echo "Contêiner PostgreSQL criado e configurado com sucesso!"