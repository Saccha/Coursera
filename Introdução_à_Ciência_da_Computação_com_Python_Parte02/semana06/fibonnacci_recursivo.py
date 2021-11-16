def fibonacci(n: int) -> int:
    """Fibonacci utilizando chamadas recursivas."""
    return n if n < 2 else fibonacci(n-1) + fibonacci(n-2)
