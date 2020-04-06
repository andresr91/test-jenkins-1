from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello():
    return "hello Andres!!!"


if _name_ == "_main_":
 app.run(host='0.0.0.0', port=5000)
