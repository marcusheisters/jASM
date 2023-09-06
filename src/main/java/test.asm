global start

section .text
start:
    mov rax, 0xA
    mov rax, 0x02000001  ; System call for exit.
    mov rdi, 0x0         ; An exit code of 0.
    syscall
