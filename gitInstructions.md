# Git Setup & GitHub Connection Guide

Here's a complete step-by-step walkthrough:

---

## Step 1: Install Git

Check if Git is already installed:
```bash
git --version
```
If not installed, download it from **git-scm.com** and follow the installer.

---

## Step 2: Configure Git Identity

Tell Git who you are (this appears in every commit):
```bash
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
```

Verify your config:
```bash
git config --list
```

---

## Step 3: Initialize Your Local Repo

Navigate to your project folder and initialize Git:
```bash
cd /path/to/your/test-repo
git init
```

---

## Step 4: Create a GitHub Repository

1. Go to **github.com** → click **"New"** (top left)
2. Name your repo (e.g., `test-repo`)
3. Choose **Public** or **Private**
4. **Do NOT** check "Add a README" (since your local repo already exists)
5. Click **"Create repository"**

---

## Step 5: Set Up SSH Authentication (Recommended)

**Generate an SSH key:**
```bash
ssh-keygen -t ed25519 -C "you@example.com"
# Press Enter to accept defaults
```

**Copy your public key:**
```bash
# Mac/Linux
cat ~/.ssh/id_ed25519.pub

# Windows (Git Bash)
cat ~/.ssh/id_ed25519.pub
```

**Add it to GitHub:**
1. GitHub → **Settings** → **SSH and GPG keys**
2. Click **"New SSH key"**
3. Paste your key → Save

**Test the connection:**
```bash
ssh -T git@github.com
# Should say: "Hi username! You've successfully authenticated..."
```

---

## Step 6: Connect Local Repo to GitHub

Copy the SSH URL from your GitHub repo page (looks like `git@github.com:username/test-repo.git`), then:

```bash
git remote add origin git@github.com:YOUR_USERNAME/test-repo.git

# Verify the remote was added
git remote -v
```

---

## Step 7: Make Your First Commit & Push

```bash
# Stage all files
git add .

# Commit with a message
git commit -m "Initial commit"

# Push to GitHub (first time sets the upstream)
git push -u origin main
```

> If your default branch is `master` instead of `main`, replace `main` with `master`.

---

## Step 8: Your Daily Commit Workflow

Every day going forward, just use this cycle:

```bash
# 1. Check what changed
git status

# 2. Stage your changes
git add .          # stage everything
# OR
git add file.txt   # stage a specific file

# 3. Commit with a meaningful message
git commit -m "describe what you changed today"

# 4. Push to GitHub
git push
```

---

## Handy Daily Commands

| Command | What it does |
|---|---|
| `git status` | See changed/staged files |
| `git log --oneline` | View recent commits |
| `git diff` | See exact line changes |
| `git pull` | Fetch latest from GitHub |

---

**Tip:** A good commit message habit → `git commit -m "feat: add login page"` or `git commit -m "fix: correct typo in README"`. It makes your history much easier to read over time.

Let me know if you hit any snags at a specific step!