# API REST d'une société de commerce factice  

## Description du projet  

C'est le cas d'une société de commerce qui dispose d'un représentant par zone géographique
pour mieux se rapprocher de ses clients et chaque client passe ses commandes par le biais de
son représentant. Les numéros de commande (sur 10 caractères) sont générés
automatiquement par le système sous la forme : CM00000001, CM00000002, .....
Le représentant souhaite de temps à autre voir la situation des commandes passées par un
client donné en fournissant le numéro du client.

- Technologie utilisée : `Spring boot` (plus une documentation grâce à `Swagger`)

## Architecture du projet  

Pour une meilleur organisation, le projet a été découpé sous forme de packages comme suit :

#### com.commerce.microservice.beans  

Contient les objets métiers ou `entités` de notre service.

#### com.commerce.microservice.controllers  

Contient nos `controllers` chargés d'exécuter les opérations correspondantes aux différents endpoints.

#### com.commerce.microservice.repositories

Contient des interfaces représentant nos `repository` permettant de manager les entités c'est à dire leur récupération et persistance.

#### com.commerce.microservice.utils

Contient des classes utilitaires.
