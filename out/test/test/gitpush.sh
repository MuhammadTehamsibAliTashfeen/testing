#!/bin/bash 
# Author: Muhammad Ali
# Description: Automates git add, commit, and push
# Usage: ./gitpush.sh "your commit message"
git add .
git commit -m "$1"
git push

