from datetime import datetime

class Stud:
    def _init_(self, name, dob):
        self.name = name
        self.dob = datetime.strptime(dob, "%d-%m-%Y") if "-" in dob else datetime.strptime(dob, "%Y-%m-%d")

    def display_info(self):
        age = (datetime.now() - self.dob).days // 365
        print(f"Name: {self.name}")
        print(f"Age: {age}")
