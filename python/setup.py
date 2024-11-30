from setuptools import setup, find_packages

setup(
    name="XTablesConsumer",  # Your package name
    version="0.0.1",  # Initial version
    description="A test consumer for the high-performance Python client for real-time management of XTablesServer network tables.",
    url="https://github.com/Kobeeeef/XTABLES",  # Replace with your repo
    packages=find_packages(),
    install_requires=open("requirements.txt", encoding="utf-16").read().splitlines(),
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
        "Operating System :: OS Independent",
    ],
    python_requires=">=3.6",
)
