FROM python:3.9.19-slim

RUN apt-get update -yqq \
    && apt-get install -yqq git avahi-utils \
    && rm -rf /var/lib/apt/lists/*

# Install Python requirements in a venv.
RUN python3 -m venv /srv/venv

COPY requirements.txt /apps/client/requirements.txt

RUN /srv/venv/bin/pip install -r /apps/client/requirements.txt

COPY . /apps/client

# Entry point - start the Python application.
ENV PYTHONPATH=/apps/client/src/
WORKDIR /apps/client
CMD ["/srv/venv/bin/python", "-m", "src.main"]
