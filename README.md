# Proyecto_Modelos
En este proyecto se aplicaran todos los patrones aprendidos en clase en el contexto de la plataforma airbnb

## Setup con VSCode

### Requisitos
- Java 23+
- Maven 3.8+
- MiKeTex (para LaTeX)

### Extensiones recomendadas
Instala estas en VSCode:
- Extension Pack for Java (redhat.java)
- LaTeX Workshop (james-yu.latex-workshop)

### Configurar LaTeX para MiKeTex
En VSCode, abre `.vscode/settings.json` (crea si no existe) y agrega:
  "latex-workshop.latex.tools": [
    {
      "name": "pdflatex",
      "command": "pdflatex",
      "args": [
        "-synctex=1",
        "-interaction=nonstopmode",
        "-file-line-error",
        "%DOC%"
      ]
    }
  ],
  "latex-workshop.latex.recipes": [
    {
      "name": "pdflatex",
      "tools": ["pdflatex"]
    }
  ]

### Compilar el proyecto
`mvn clean package`