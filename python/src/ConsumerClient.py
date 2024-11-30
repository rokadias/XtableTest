import time
from XTABLES import XTablesClient


def handle_target_waypoints(key, val) -> None:
    if not key or not val:
        print("No key or val passed to handle_target_waypoints")
        return
    print(f"key: {key}")
    print(f"val: {val}")


def consumer_loop() -> None:
    client = XTablesClient(server_port=1735)

    try:
        client.subscribe_to_key("target_waypoints", consumer=handle_target_waypoints)
    except Exception as e:
        print(f"exception: {e}")

    while True:
        pass
