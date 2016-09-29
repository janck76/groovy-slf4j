#!/usr/bin/env bash

# Testing av slf4j og groovy

# lib inneholder jar dependencies 
# resources inneholder logback.groovy. NB! bruk katalognavn her, ikke * eller filnavn
# På Windows brukes ; som separator
groovy -cp 'lib/*:resources' logger.groovy

