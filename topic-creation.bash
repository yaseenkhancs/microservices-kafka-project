docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-0 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic user-added --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-0 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic video-posted --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-1 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic watcher-added --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-1 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic another-hashtag --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic hashtag-added --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic video-disliked --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-0 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic video-liked --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-0 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic video-liked-by-hour --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-1 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic user-subscribed --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic user-unsubscribed --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic videos-metrics-liked-by-hour --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic videos-metrics-liked-by-hour-repartition --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic videos-metrics-aggregated-repartition --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic subs-stream-liked-by-hour-repartition --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic videos-metrics-huh-repartition --replication-factor 3 --partitions 6
docker compose -p assessment-prod -f compose-prod.yml exec -e JMX_PORT= kafka-2 kafka-topics.sh --bootstrap-server kafka-0:9092 --create --topic subs-stream-aggregated-repartition --replication-factor 3 --partitions 6