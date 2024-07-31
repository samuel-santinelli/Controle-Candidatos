# Candidate control challenge

This project is a simple Java application designed to demonstrate control flow using loops and exception handling. It takes two integer parameters from the user and prints a series of incremented numbers based on these inputs. If the first parameter is greater than the second, the application throws a custom exception.

## Project Structure

- **Count.java**: This is the main class containing the logic for the program. It reads user input, validates the parameters, and performs the counting logic.
- **InvalidParamsException.java**: A custom exception class that is thrown when the second parameter is not greater than the first parameter.

## Ho1. **Input Parameters:**
   - The program will prompt you to enter two integers.
   - The first integer (`parametroUm`) should be smaller than the second integer (`parametroDois`).
   - If `parametroUm` is greater than or equal to `parametroDois`, an exception will be thrown.

## Example Usage

1. **Valid Input:**
   ```
   Digite o primeiro parâmetro
   12
   Digite o segundo parâmetro
   30
   ```

   Output:
   ```
   Imprimindo o número 1
   Imprimindo o número 2
   ...
   Imprimindo o número 18
   ```

2. **Invalid Input:**
   ```
   Digite o primeiro parâmetro
   30
   Digite o segundo parâmetro
   12
   ```

   Output:
   ```
   O segundo parâmetro deve ser maior que o primeiro
   ```

## Custom Exception

The `ParametrosInvalidosException` class extends the `Exception` class. It is used to handle cases where the second parameter is not greater than the first parameter. This exception is thrown with a message: "O segundo parâmetro deve ser maior que o primeiro".

## License

This project is open-source and available under the [MIT License](LICENSE).

## Author

- [Samuel Santinelli](https://github.com/samuel-santinelli)

Feel free to contribute by opening issues or submitting pull requests!

---

This `README.md` provides an overview of the project, instructions for running the program, and examples of usage. Make sure to replace `<repository_url>` with the actual URL of your repository and `[Your Name]` with your name and GitHub profile link if applicable.
