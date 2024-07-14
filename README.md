# Pacman-Klon auf der Engine Pi

Pac-Man ist ein Arcade- und Videospiel, welches
erstmals am 22. Mai 1980 von Namco in Japan als „Puck Man“ für Arcade-Automaten
veröffentlicht wurde.[^wikipedia]

Der Name leitet sich von der japanischen Lautmalerei paku paku für „wiederholt
den Mund öffnen und schließen“ und der Puck-förmigen Gestalt der Hauptfigur her;
zudem bedeutet puck auf Englisch auch „Kobold“. Es wurde vom Spieledesigner Tōru
Iwatani entworfen. Am 26. Oktober 1980 erschien das Spiel von Midway lizenziert
als Pac-Man in den USA. Der Name wurde geändert, da man befürchtete, dass die
Aufschrift „Puck Man“ auf dem Automaten in „Fuck Man“ abgewandelt werden könnte.
Spielerisch blieb es unverändert, außer dass die vier Geister im Spiel andere
Namen erhielten.[^wikipedia]

## Emulation

Das Original kann heute mit einem Emulator (z.
B. MAME) gespielt werden, wobei die eigentlichen Spieldateien (ROMs) bei
universellen Emulatoren nicht inbegriffen sind.[^wikipedia]

```sh
sudo apt install mame
```

## Originale Arcade-Automaten-Hardware

Steuerung Joystick (4 Richtungen)
Gehäuse Standard und Cocktail
Arcade-System CPU: Zilog Z80 getaktet mit 3,072 MHz
Monitor Raster,
Auflösung: 224 × 288 (Vertikal), 16 Farben[^wikipedia]

## Farben

[^almightyguru]
[^aarongiles]

| Index | Color  | Converted RGB | Binary / Hex / Decimal | Uses                                                        |
| ----- | ------ | ------------- | ---------------------- | ----------------------------------------------------------- |
| 0     | Black  | 0, 0, 0       | 00000000 0x00 0        | Background                                                  |
| 1     | Red    | 252, 0, 0     | 00000111 0x07 7        | Blinky, cherry, strawberry, apple, Galaxian ship            |
| 2     | Brown  | 216, 144, 85  | 01100110 0x66 102      | Orange top, cherry stem                                     |
| 3     | Pink   | 252, 180, 255 | 11101111 0xEF 239      | Pinky, ghost house door                                     |
| 4     | Black  | 0, 0, 0       | 00000000 0x00 0        | Background                                                  |
| 5     | Cyan   | 0, 252, 255   | 11111000 0xF8 248      | Inky, player text                                           |
| 6     | Blue   | 72, 180, 255  | 11101010 0xEA 234      | Key top, bell bottom                                        |
| 7     | Orange | 252, 180, 85  | 01101111 0x6F 111      | Clyde, orange                                               |
| 8     | Black  | 0, 0, 0       | 00000000 0x00 0        | Background                                                  |
| 9     | Yellow | 252, 252, 0   | 00111111 0x3F 63       | Pac-Man, ready!, bell, Galaxian ship                        |
| A     | Black  | 0, 0, 0       | 00000000 0x00 0        | Background                                                  |
| B     | Indigo | 36, 36, 255   | 11001001 0xC9 192      | Maze walls, flashing ghosts, ghost pupils, Galaxian ship    |
| C     | Green  | 0, 252, 0     | 00111000 0x38 56       | Melon, strawberry top, orange leaf                          |
| D     | Teal   | 72, 180, 170  | 10101010 0xAA 170      | Melon wrinkles and stem                                     |
| E     | Salmon | 252, 180, 170 | 10101111 0xAF 175      | Dots, ghost body, ghost face when flashing                  |
| F     | White  | 252, 252, 255 | 11111111 0xFF 255      | Flashing ghosts, scores, text, ghost eyes, fruit highlights |

[^almightyguru]: http://www.thealmightyguru.com/Wiki/index.php?title=Pac-Man#Color_Palette
[^aarongiles]: https://aarongiles.com/mamemem/part3.html

## Links

- [Pacman Emulator (dotnet)](https://github.com/Justin-Credible/pac-man-emulator)
- [Longplay Arcade Game (1980 Namco (Midway License for US release)](https://www.youtube.com/watch?v=dScq4P5gn4A)

[^wikipedia]: https://de.wikipedia.org/wiki/Pac-Man
